<!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Login</title>
            <script src="libraries/jquery-3.4.1.min.js"></script>
            <script src="libraries/sweetalert2.all.min.js"></script>
            <link rel="stylesheet" href="public/css/main.css">
        </head>
        <body>
            <div class="login">
                <h1>Login</h1>
                <form method="post">
                    <input type="text" placeholder="Usuario." id="email" required="required" />
                    <input type="password" placeholder="Contraseña." id="password" required="required" />
                    <button type="submit" id="ingresar" class="btn btn-primary btn-block btn-large">Ingresar.</button>
                </form>
            </div>
        </body>
        <script src="models/login.js" type="module"></script>
    </html>