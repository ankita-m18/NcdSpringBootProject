package com.ankita.ncd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.ankita.ncd.dao.PatientDao;
import com.ankita.ncd.entity.Patient;
import com.ankita.ncd.entity.Score;
import com.ankita.ncd.entity.SearchEntity;
import com.ankita.ncd.service.PatientService;

@Controller
public class PatientController 
{
	@Autowired
	PatientDao pd;
	PatientService ps;
	Patient gp;
	
	
	
	@RequestMapping("/")
	public String home() 
	{
		return "index";
	}
	
	@RequestMapping("/index")
	public String homeback() 
	{
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() 
	{
		return "about";
	}
	
	@RequestMapping("/contacts")
	public String contacts() 
	{
		return "contacts";
	}
	
	@RequestMapping("/registration")
	public String registrationpage() 
	{
		return "registration";
	}
	
	public String final_touch(String field)
	{
	    String field1,field2,field3;
		field1 = field.strip();
	    field2 = field1.replace("\\", "");
	    field3 = field2.replace("<.*?\\>", "");
	    return field3;
	}
	
	@RequestMapping(value="/register",method =RequestMethod.POST )
	public String addPatient(Patient patient,Model model)
	{
		System.out.println(patient);
		System.out.println(gp);
		gp=patient;
		System.out.println(gp);
		System.out.println(gp);
		
		
		String error_firstname="",error_lastname="",error_gender="",error_phone="";
		String error_dob="",error_pincode="",error_head="",error="";
		String error_display_firstname="none",error_display_lastname="none";
		String error_display_gender="none";
		String error_display_phone="none",error_display_pincode="none",error_display_dob="none";
		String error_display_head="none";
	    int flag_error=0;
		
	    String firstname=patient.getFirstname();
	    String lastname=patient.getLastname();
	    String gender=patient.getGender();
	    //String aadhaar=patient.getFirstname();
	    String phone=patient.getPhone();
	    String birthday=patient.getBirthday();
	    String pincode=String.valueOf(patient.getPincode());
	    
	    System.out.println("firstname");
	    System.out.println("lastname");
	    System.out.println("gender");
	    //System.out.println("aadhaar");
	    System.out.println("phone");
	    System.out.println("birthday");
	    System.out.println("pincode");
	    
		if(firstname.isEmpty())
		{
            flag_error=1;
            System.out.println("1"+flag_error);
            error_display_firstname="block";
            error_firstname="Error: First Name is required";
            
            model.addAttribute("error_display_firstname",error_display_firstname);
            model.addAttribute("error_firstname",error_firstname);
            
            return "registration";
		}
             
        else
        {
            final_touch(firstname);
            if(firstname.isBlank())
            {
                flag_error=1;
                System.out.println("2"+flag_error);
                error_display_firstname="block";
                error_firstname="Error: First Name can't start with a SPACE";
                
                model.addAttribute("error_display_firstname",error_display_firstname);
                model.addAttribute("error_firstname",error_firstname);
                
                return "registration";
            }
        }
		
		if(lastname.isEmpty())
		{
            flag_error=1;
            System.out.println("3"+flag_error);
            error_display_lastname="block";
            error_lastname="Error: Last Name is required";
            
            model.addAttribute("error_display_lastname",error_display_lastname);
            model.addAttribute("error_lastname",error_lastname);
            
            return "registration";
		}     
        else
        {
            final_touch(lastname);
            if(lastname.isBlank())
            {
                flag_error=1;
                System.out.println("4"+flag_error);
                error_display_lastname="block";
                error_lastname="Error: Last Name can't start with a SPACE";
                
                model.addAttribute("error_display_lastname",error_display_lastname);
                model.addAttribute("error_lastname",error_lastname);
                
                return "registration";
            }
        }
		
		if(gender.isEmpty())
		{
			flag_error=1;
			System.out.println("5"+flag_error);
			error_display_gender="block";
			error_gender="Error: Select your gender";
					
		    model.addAttribute("error_display_gender",error_display_gender);
			model.addAttribute("error_gender",error_gender);
			
			
			return "registration";
			
		}
		else
		{
			gender = final_touch(gender);
		}
            
		/*if(aadhaar.isEmpty())
		{
			flag_error=1;
			System.out.println("6"+flag_error);
			error_display_aadhaar="block";
			error_aadhaar="Error: Aadhaar UID is required";
			
			model.addAttribute("error_display_aadhaar",error_display_aadhaar);
			model.addAttribute("error_aadhaar",error_aadhaar);
			
			return "registration";
		}
        else
        {
        	aadhaar = final_touch(aadhaar);
        	if(aadhaar.length()<12)
        	{
        		flag_error=1;
        		System.out.println("7"+flag_error);
        		error_display_aadhaar="block";
        		error_aadhaar="Error: Aadhaar UID must be 12 digits long";
        		
        		model.addAttribute("error_display_aadhaar",error_display_aadhaar);
        		model.addAttribute("error_aadhaar",error_aadhaar);
        		
        		return "registration";
        	}        	
        	
        }*/
		
		if(phone.isEmpty())
		{
			flag_error=1;
			System.out.println("8"+flag_error);
			error_display_phone="block";
			error_phone="Error: Phone No. is required";
			
			model.addAttribute("error_display_phone",error_display_phone);
			model.addAttribute("error_phone",error_phone);
			
			return "registration";
		}
        else
        {
        	phone = final_touch(phone);
        	System.out.println("----------------------------"+phone);
        	if(phone.length() <10)
        	{
        		flag_error=1;
        		System.out.println("9"+flag_error);
        		error_display_phone="block";
        		error_phone="Error: Phone No. must be 10 digits long";
        		
        		model.addAttribute("error_display_phone",error_display_phone);
        		model.addAttribute("error_phone",error_phone);
        		
        		return "registration";
        	}
        }
		 
		if(birthday.isEmpty())
		{
			flag_error=1;
			System.out.println("10"+flag_error);
			error_display_dob="block";
			error_dob="Error: Date fo Birth is required";
			
			model.addAttribute("error_display_dob",error_display_dob);
			model.addAttribute("error_dob",error_dob);
			
			return "registration";
		}
	    else 
	    {
	    	birthday = final_touch(birthday);
	    }
	    
		if(pincode.isEmpty())
		{
			flag_error=1;
			System.out.println("11"+flag_error);
			error_display_pincode="block";
			error_pincode="Error: Pincode. is required";
			
			model.addAttribute("error_display_pincode",error_display_pincode);
			model.addAttribute("error_pincode",error_pincode);
			
			return "registration";
		}
        else
        {
        	pincode = final_touch(pincode);
        	if(pincode.length()<6)
        	{
        		flag_error=1;
        		System.out.println("12"+flag_error);
        		error_display_pincode="block";
        		error_pincode="Error: Pincode. must be 10 digits long";
        		
        		model.addAttribute("error_display_pincode",error_display_pincode);
        		model.addAttribute("error_pincode",error_pincode);
        		
        		return "registration";
        	}
        }
            
		if(flag_error==0)
		{
			System.out.println("Overall 0"+flag_error);
			error_display_firstname="none";
			error_display_lastname="none";
			error_display_gender="none";
			//error_display_aadhaar="none";
			error_display_phone="none";;
			error_display_pincode="none";
			error_display_dob="none";
			pd.save(patient);	    
		}
            
        if(flag_error==1)
        {
        	System.out.println("Overall 1"+flag_error);
        	error_display_head="block";
        	error_head="There are one or more errors in your form. Correct them and register again !";
        	
        	model.addAttribute("error_display_head",error_display_head);
        	model.addAttribute("error_head",error_head);
        	
        	return "registration";
        }
        
               
		pd.save(patient);
		return "checklist";
	}
	
	
	@RequestMapping("/checklist")
	public String ChecklistPage(Model model)
    {
        model.addAttribute("Score", new Score());
  
        return "checklist";
    }
	
	
	
	public void updateCustomerContacts(long id, int sc, String res) 
	{
        System.out.println("UPDATE CUSTOMER FUNCTION IS CALLING  ");
        Patient myPatient = pd.findById(id);
        //myPatient.setScore = sc;
        //myPatient.screening = res;
        myPatient.setScore(sc);
        myPatient.setScreening(res);
        System.out.println("this is the customer data ");
        System.out.println(myPatient);
        pd.save(myPatient);
    }
	
	
	@RequestMapping(value="/submit", method = RequestMethod.POST)
	public String updatePatient(Patient patient,@ModelAttribute Score score,BindingResult result, Model model)
	{
		System.out.println("This is global object "+gp);
		System.out.println("This is patient id object "+patient);
		
		
		int total = score.getAge() + score.getSmoke() + score.getAlcohol() + score.getWaist() + score.getPhy_act() + score.getFam_his();
		String screening = "";
		if (total > 4)
		{
			screening ="Yes";
		    model.addAttribute("result","The person may be at higher risk of NCDs and needs to be prioritized for attending screening.");
		}
		else
		{
			screening="No";
			model.addAttribute("result","The person is not at risk of NCDs and doesn't need screening.");
		}
			
		System.out.println(gp.getPatient_id());
		
		model.addAttribute("total_score",total);

		long id = gp.getPatient_id();
		System.out.println("This is a patient id:"+id);		
        updateCustomerContacts(id,total, screening);
        System.out.println("this is result page ");
        
		return "result";
	}
	
	@RequestMapping("/searchpage")
	public String searchpage() 
	{
		return "search";
	}
	
	@RequestMapping("/alldata")
	public String viewAllData(Model model) 
	{
		
		model.addAttribute("records",pd.findAll());
		System.out.println("All the patient records ---"+pd);
		return "search";
	}
	
	
	
	
	@RequestMapping("/search")
	public String search(Patient patient,SearchEntity sp,Model model) 
	{
		String error_firstname="",error_lastname="",error_patient_id="";
		String error_display_firstname="none",error_display_lastname="none",error_display_patient_id="none";
		
		
		System.out.println("seach input value :"+sp.getPk());
        System.out.println("drop downlist  value :"+sp.getChoice());
		
        List<Patient> pat=(List<Patient>) pd.findAll();
		
        List<Patient> result= new ArrayList<Patient>();
        
        String pid=sp.getPk();
        String option=sp.getChoice();
        
        for(Patient p : pat)
        {
        	System.out.println("Inside for loop");
        	if("PATIENT ID".equals(option))
        	{
        		if(pid.isEmpty())
        		{
        			error_display_patient_id="block";
        			error_patient_id="Error: Patient ID is required";
        			
        			model.addAttribute("error_display_patient_id",error_display_patient_id);
                    model.addAttribute("error_patient_id",error_patient_id);
        		
        		}
        		else
        		{
        			final_touch(pid);
        			if(pid.isBlank())
        			{
        				error_display_patient_id="block";
            			error_patient_id="Error: Patient ID doesn't start with a SPACE";
            			
            			model.addAttribute("error_patient_id",error_display_patient_id);
                        model.addAttribute("error_patient_id",error_patient_id);
        			}
        			else if(pid.length()>14)
        			{
        				error_display_patient_id="block";
            			error_patient_id="Error: Patient ID must be less than 14 digits";
            			
            			model.addAttribute("error_display_patient_id",error_display_patient_id);
                        model.addAttribute("error_patient_id",error_patient_id);
        			}
        			else
        			{
        				pid=final_touch(pid);
        				if(pid.matches("-?\\d+(\\.\\d+)?"))
        				{
        					String patid=String.valueOf(p.getPatient_id());
        	        		if(patid.equals(pid))
        	        		{
        	        			System.out.println("Inside Patient id choices");
        	        			result.add(p);
        	        			System.out.println(result);
        	        			
        	        		}
        	        		else
        	        		{
        	        			error_display_patient_id="block";
                    			error_patient_id="Error: Patient ID is not present in the database.";
                    			
                    			model.addAttribute("error_display_patient_id",error_display_patient_id);
                                model.addAttribute("error_patient_id",error_patient_id);
        	        		}
        				}
        				else 
        				{
        					error_display_patient_id="block";
                			error_patient_id="Error: Enter digits only";
                			
                			model.addAttribute("error_display_patient_id",error_display_patient_id);
                            model.addAttribute("error_patient_id",error_patient_id);
        				}
        			}
        		}
        		
        	}
        	
        	if("FIRST NAME".equals(option))
        	{
        		pid = StringUtils.capitalize(pid);
        		if(pid.isEmpty())
        		{
        			error_display_firstname="block";
        			error_firstname="Error: First Name is required";
        			
        			model.addAttribute("error_display_firstname",error_display_firstname);
                    model.addAttribute("error_firstname",error_firstname);
        		
        		}
        		else
        		{
        			final_touch(pid);
        			if(pid.isBlank())
        			{
        				error_display_firstname="block";
            			error_firstname="Error: First Name doesn't start with a SPACE";
            			
            			model.addAttribute("error_display_firstname",error_display_firstname);
                        model.addAttribute("error_firstname",error_firstname);
        			}
        			else
        			{
        				pid = final_touch(pid);
        				if(pid.matches("^[a-zA-Z\\s]+$"))
        				{
        					String fname=p.getFirstname();
        	        		if(fname.equals(pid))
        	        		{
        	        			System.out.println("Inside firstname choices");
        	        			result.add(p);
        	        			System.out.println(result);
        	        			
        	        		}
        	        		else
        	        		{
        	        			error_display_firstname="block";
                    			error_firstname="Error: First Name is not present in the database.";
                    			
                    			model.addAttribute("error_display_firstname",error_display_firstname);
                                model.addAttribute("error_firstname",error_firstname);
        	        		}
        	        		
        				}
        			}
        		}
        	}
        	
        	if("LAST NAME".equals(option))
        	{
        		pid = StringUtils.capitalize(pid);
        		if(pid.isEmpty())
        		{
        			error_display_firstname="block";
        			error_firstname="Error: Last Name is required";
        			
        			model.addAttribute("error_display_lastname",error_display_lastname);
                    model.addAttribute("error_lastname",error_lastname);
        		
        		}
        		else
        		{
        			final_touch(pid);
        			if(pid.isBlank())
        			{
        				error_display_lastname="block";
            			error_lastname="Error: Last Name doesn't start with a SPACE";
            			
            			model.addAttribute("error_display_lastname",error_display_lastname);
                        model.addAttribute("error_lastname",error_lastname);
        			}
        			else
        			{
        				pid = final_touch(pid);
        				if(pid.matches("^[a-zA-Z\\s]+$"))
        				{
        					String lname=p.getLastname();
        	        		if(lname.equals(pid))
        	        		{
        	        			System.out.println("Inside lastname choices");
        	        			result.add(p);
        	        			System.out.println(result);
        	        			
        	        		}
        	        		else
        	        		{
        	        			error_display_lastname="block";
                    			error_lastname="Error: Last Name is not present in the database.";
                    			
                    			model.addAttribute("error_display_lastname",error_display_lastname);
                                model.addAttribute("error_lastname",error_lastname);
        	        		}
        	        		
        				}
        			}
        		}
        	}
        	
        }
        
        model.addAttribute("records",result);
        
        
		/*if("FIRST NAME".equals(sp.getChoice()))
		{
			System.out.println("Inside choices");
			model.addAttribute("records",ps.getPatientByFirstname(sp.getPk()));
		*/
		
		//System.out.println("All the patient records ---"+ps);
		return "search";
	}
	
	@RequestMapping("/hidedata")
	public String hidedata()
	{
		return "search";
	}
	    
	@Controller
	public class MyErrorController implements ErrorController  {

		@RequestMapping("/error")
		public String handleError(HttpServletRequest request) {
		    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		    
		    if (status != null) {
		        Integer statusCode = Integer.valueOf(status.toString());
		    
		        if(statusCode == HttpStatus.NOT_FOUND.value()) {
		            return "404";
		        }
		        else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
		            return "500";
		        }
		    }
		    return "error";
		}
	}
	
	
	
}
