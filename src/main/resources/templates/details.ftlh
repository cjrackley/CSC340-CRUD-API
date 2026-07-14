<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Character Details</title>
    <link rel="stylesheet" href="/style.css">
</head>

<body>
    <nav class="nav">
        <a href="/sorcerers"><button>Home</button></a>
        <a href="/sorcerers/details/1"><button>Details</button></a>
        <a href="/sorcerers/about"><button>About</button></a>
        <a href="/sorcerers/new"><button>Add a Character</button></a>
    </nav>

    <main class="main details-main">
        <div class="profile">
            <!-- Picture -->
            <div class="profile-image">
                <img src="${sorcerer.image!'/images/icon.png'}" alt="${sorcerer.name}">
                <h1>${sorcerer.name}</h1>
                <div class="back">
                    <a href="/sorcerers"><button>Back</button></a>
                </div>
            </div>

            <!-- Text sections -->
            <div class="profile-info">
                <h2>Overview</h2>
                <p>${sorcerer.description}</p>

                <h2>Age</h2>
                <p>${sorcerer.age}</p>

                <h2>Grade</h2>
                <p>${sorcerer.grade}</p>
            </div>

        </div>
    </main>

    <footer class="footer">
        <p>Thank you for visiting the Jujutsu Kaisen Sorcerer Gallery!</p>
    </footer>
</body>

</html>