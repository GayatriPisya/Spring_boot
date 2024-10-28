<html>
<head>
    <title>Welcome Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e0f7fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .welcome-container {
            background-color: white;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        .welcome-container h2 {
            color: #333;
            font-size: 24px;
            margin-bottom: 10px;
        }
        .welcome-container p {
            font-size: 18px;
            color: #555;
        }
        .logout-btn {
            background-color: #f44336;
            color: white;
            border: none;
            padding: 10px 20px;
            margin-top: 20px;
            cursor: pointer;
            border-radius: 5px;
        }
        .logout-btn:hover {
            background-color: #e53935;
        }
    </style>
</head>
<body>
    <div class="welcome-container">
        <h2>Hello, ${username}!</h2>
        <p>Welcome to the Dashboard..!!</p>
        <button class="logout-btn" onclick="window.location.href='/login'">Logout</button>
    </div>
</body>
</html>
