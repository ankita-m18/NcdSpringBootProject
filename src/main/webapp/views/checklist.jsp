<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>NCD Risk Assessment Checklist</title>
</head>

<body>
    <h1>Patient Id : ${ patient.getPatient_id() }</h1>
    <p style="color:red;">
        ${error}
    </p>
    <form name="NCD" method="POST" action="/submit">
        <table align="center" border="1" height="" width="">
            <tr>
                <th colspan="4" style="background-color:rgb(52, 173, 52)">NCD Risk Assessment Checklist</th>
            </tr>

            <tr style="background-color:skyblue">
                <th>Question</th>
                <th colspan="2">Range</th>
                <th>Circle Any</th>
            </tr>


            <tr>
                <td rowspan="4">1. What is your age? (in complete years)</td>
                <td colspan="2"> 30-39</td>
                <td><input type="radio" name="age" value="0"></td>
            </tr>
            <tr>
                <td colspan="2"> 40-49</td>
                <td><input type="radio" name="age" value="1"></td>
            </tr>
            <tr>
                <td colspan="2"> 50-59</td>
                <td><input type="radio" name="age" value="2"></td>
            </tr>
            <tr>
                <td colspan="2"> >60</td>
                <td><input type="radio" name="age" value="3"></td>
            </tr>
            <tr>
                <td rowspan="3">2. Do you smoke or Consume smokeless product like Gutka or Khaini?</td>
                <td colspan="2"> Never</td>
                <td><input type="radio" name="smoke" value="0"></td>
            </tr>
            <tr>
                <td colspan="2"> Used to consume in past/ sometime now</td>
                <td><input type="radio" name="smoke" value="1"></td>
            </tr>
            <tr>
                <td colspan="2"> Daily</td>
                <td><input type="radio" name="smoke" value="2"></td>
            </tr>


            <tr>
                <td rowspan="2">3. Do you consume alcohol daily?</td>
                <td colspan="2"> No</td>
                <td><input type="radio" name="alcohol" value="0"></td>
            </tr>
            <tr>
                <td colspan="2"> Yes</td>
                <td><input type="radio" name="alcohol" value="1"></td>
            </tr>


            <tr>
                <td rowspan="4">4. Measurement of waist in (cm)</td>
                <td style="background-color:skyblue"> Female</td>
                <td style="background-color:skyblue"> Male</td>
                <td></td>
            </tr>
            <tr>
                <td> 80 cm or less</td>
                <td> 90 cm or less</td>
                <td><input type="radio" name="waist" value="0"></td>
            </tr>
            <tr>
                <td> 81-90 cm</td>
                <td> 90-100 cm</td>
                <td><input type="radio" name="waist" value="1"></td>
            </tr>
            <tr>
                <td> More than 90 cm</td>
                <td> More than 100 cm</td>
                <td><input type="radio" name="waist" value="2"></td>
            </tr>


            <tr>
                <td rowspan="2">5. Do you undertake any physical activities for a minimum of 150 minutes a week?</td>
                <td colspan="2"> At least 150 minutes a week</td>
                <td><input type="radio" name="phy_act" value="0"></td>
            </tr>
            <tr>
                <td colspan="2"> Less than 150 min a week</td>
                <td><input type="radio" name="phy_act" value="1"></td>
            </tr>


            <tr>
                <td rowspan="2">6. Do you have a family history (any one of your parents or siblings) of high blood
                    pressure, diabetes and heart disease?</td>
                <td colspan="2"> No</td>
                <td><input type="radio" name="fam_his" value="0"></td>
            </tr>
            <tr>
                <td colspan="2"> Yes</td>
                <td><input type="radio" name="fam_his" value="2"></td>
            </tr>


            <tr style="text-align:right">
                <th rowspan="2" style="background-color:lightpink" align="left">Total Score: (Click on Calculate)</th>
                <td colspan="4" style="background-color:lightpink">
                    <input type="submit" value="Calculate">
                    <!--<input type="reset" value="Reset" onclick="validation()">-->
                </td>
            </tr>

        </table>
        <h2>A score above 4 indicates that the person may be at higher risk of NCDs and
            needs to be prioritized for attending screening for following NCDs and then confirmed
            if there is any of them.<br>
            1.Diabetes<br>
            2.Hypertension<br>
            3.Breast Cancer<br>
            4.Cervical Cancer<br>
            5.Oral Cancer<br>
            For those who are curious - more about NCD -
            <a
                href=https://www.who.int/news-room/fact-sheets/detail/noncommunicable-diseases>https://www.who.int/news-room/fact-sheets/detail/noncommunicable-diseases</a>
        </h2>
    </form>


    <script type="text/javascript">
        function validation() {
            if (document.getElementByName('age').checked == false) {
                alert("Answer the 1st question");
            }
            if (document.getElementByName('smoke').checked == false) {
                alert("Answer the 2nd question");
            }
            if (document.getElementByName('alcohol').checked == false) {
                alert("Answer the 3rd question");
            }
            if (document.getElementByName('waist').checked == false) {
                alert("Answer the 4th question");
            }
            if (document.getElementByName('phy_act').checked == false) {
                alert("Answer the 5th question");
            }
            if (document.getElementByName('fam_his').checked == false) {
                alert("Answer the 6th question");
            }

        }
    </script>

</body>

</html>