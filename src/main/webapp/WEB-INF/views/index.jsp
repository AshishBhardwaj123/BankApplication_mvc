<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Banking MVC App</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px 20px;
            background-color: #343a40;
            color: white;
            position: fixed;
            top: 0;
            width: 100%;
            z-index: 1;
        }

        .navbar-brand {
            color: white;
            text-decoration: none;
            font-size: 1.5rem;
        }

        .navbar-brand:hover {
            color: #ccc;
        }

        .container {
            padding-top: 70px; /* Adjust to avoid overlap with fixed navbar */
            text-align: center;
        }

        .starter-template {
            margin-top: 50px;
        }

        h1, h2, h3 {
            margin: 0 0 20px 0;
        }

        .btn {
            display: inline-block;
            font-size: 24px;
            padding: 10px 20px;
            margin: 5px;
            color: white;
            background-color: #17a2b8;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            transition: background-color 0.3s;
        }

        .btn:hover {
            background-color: #138496;
        }
    </style>
</head>
<body>
    <nav class="navbar">
        <a class="navbar-brand" href="#">com.spring</a>
    </nav>
    <main role="main" class="container">
        <div class="starter-template">
            <h1>Welcome To</h1>
            <h2>
                <span id="message-container">
                    <!-- Placeholder for message -->
                </span>
            </h2> <br>
            <h3>Manage:</h3> <br> <br>
            <div style="font-size: 25px;">
                <a href="/spring-mvc-hello-world-jsp/banks" class="btn">Bank</a>
                <a href="/spring-mvc-hello-world-jsp/branches" class="btn">Branch</a>
                <a href="/spring-mvc-hello-world-jsp/accounts" class="btn">Account</a>
                <a href="/spring-mvc-hello-world-jsp/loans" class="btn">Loan</a>
                <a href="/spring-mvc-hello-world-jsp/customers" class="btn">Customer</a>
            </div>
        </div>
    </main>
    <script>
        // JavaScript to handle message display
        window.onload = function() {
            var messageContainer = document.getElementById('message-container');
            var message = ''; // Replace with dynamic value if needed
            if (message) {
                messageContainer.textContent = 'Hello ' + message;
            } else {
                messageContainer.textContent = 'Banking Management MVC App!';
            }
        };
    </script>
</body>
</html>
