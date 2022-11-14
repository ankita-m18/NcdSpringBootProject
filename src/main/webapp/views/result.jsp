<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
    <title>Result</title>
</head>

<body>

    
        <table class="table table-striped-columns" align="center" table-border="1" height="" width="">
            <tr>
                <th colspan="2" style="background-color:rgb(52, 173, 52);text-align:center">NCD Risk Assessment Checklist Score</th>
            </tr>

            <tr style="background-color:skyblue">
                <th style="text-align:center">Question</th>
                <th style="text-align:center">Score</th>
            </tr>


            <tr>
                <td>1. What is your age? (in complete years)</td>
                <td style="text-align:center">${ score.getAge() }</td>
            </tr>

            <tr>
                <td>2. Do you smoke or Consume smokeless product like Gutka or Khaini?</td>
                <td style="text-align:center">${ score.getSmoke() }</td>
            </tr>

            <tr>
                <td>3. Do you consume alcohol daily?</td>
                <td style="text-align:center">${ score.getAlcohol() }</td>
            </tr>

            <tr>
                <td>4. Measurement of waist in (cm)</td>
                <td style="text-align:center">${ score.getWaist()}</td>
            </tr>

            <tr>
                <td>5. Do you undertake any physical activities for a minimum of 150 minutes a week?</td>
                <td style="text-align:center">${ score.getPhy_act() }</td>
            </tr>

            <tr>
                <td>6. Do you have a family history (any one of your parents or siblings) of high blood pressure,
                    diabetes and heart disease?</td>
                <td style="text-align:center">${ score.getFam_his() }</td>
            </tr>

            <tr >
                <th rowspan="2" style="background-color:lightpink" align="left">Total Score: </th>
                <td style="text-align:center">${ total_score }</td>
            </tr>

        </table>
        <h2>${result}</h2>
        <button class="btn btn-outline-success" onclick="location.href='/index'" style="text-align:center">Home</button>
    
</body>

</html>