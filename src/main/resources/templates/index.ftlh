<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jujutsu Kaisen Sorcerers</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>
    <nav class="nav">
        <a href="/sorcerers"><button>Home</button></a>
        <a href="/sorcerers/details/1"><button>Details</button></a>
        <a href="/sorcerers/about"><button>About</button></a>
        <a href="/sorcerers/new"><button>Add a Character</button></a>
    </nav>

    <main class="main">
        <!-- Title and description -->
        <div class="intro">
            <h1>Jujutsu Kaisen Sorcerers</h1>
            <p>Explore a collection of sorcerers from the anime Jujutsu Kaisen.</p>
        </div>

        <!-- Search bar and category buttons -->
        <div class="search">
            <input type="search" placeholder="Search...">
            <div class="categories">
                <button>Grade 4</button>
                <button>Grade 3</button>
                <button>Grade 2</button>
                <button>Grade 1</button>
                <button>Special Grade</button>  
            </div>
        </div>

        <!-- Container of cards -->
        <div class="cards">
                <#list sorcererList as sorcerer>
                    <div class="card">
                    <img class="index-image" src="${sorcerer.image!'/images/icon.png'}" alt="${sorcerer.name}">
                    <h3>${sorcerer.name}</h3>
                    <span>${sorcerer.grade}</span>
                    <p>${sorcerer.description}</p>
                    <a href="/sorcerers/details/${sorcerer.id?c}"><button>View Details</button></a>
                    </div>
                </#list>
        </div>
    </main>

    <footer class="footer">
        <p>Thank you for visiting the Jujutsu Kaisen Sorcerer Gallery!</p>
    </footer>
</body>
</html>