<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Number Input Form</title>
</head>
<body>
    <h1>Enter Two Numbers</h1>
    
    <form action="calcadd" method="POST">
        <label for="number1">First Number:</label>
        <input type="number"  name="n1" required>
        <br><br>
        
        <label for="number2">Second Number:</label>
        <input type="number" name="n2" required>
        <br><br>
        
         <h3>Select an operation:</h3>
        <label>
            <input type="radio" name="operation" value="add" required> Addition
        </label><br>
        <label>
            <input type="radio" name="operation" value="subtract"> Subtraction
        </label><br>
        <label>
            <input type="radio" name="operation" value="multiply"> Multiplication
        </label><br>
        <input type="submit" value="Calculate">
   
        
      
    </form>
    
</body>
</html>



