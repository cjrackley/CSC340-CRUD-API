<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Character form</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>
    <nav class="nav">
        <a href="/sorcerers"><button>Home</button></a>
        <a href="/sorcerers/details/1"><button>Details</button></a>
        <a href="/sorcerers/about"><button>About</button></a>
        <a href="/sorcerers/new"><button>Add a Character</button></a>
    </nav>

    <main class="main form-main">
        <!-- First container: header and description -->
        <div class="form-intro">
            <h1>Add a Character</h1>
            <p>Fill out the form below to add a new sorcerer to the collection.</p>
        </div>

        <!-- Second container: the form -->
        <div class="form-card">
            <form action="/sorcerers/save" method="post">
                <label for="name">Name</label>
                <input type="text" id="name" name="name" placeholder="Enter character name" required>

                <label for="description">Short Description</label>
                <input type="text" id="description" name="description" placeholder="Enter a short description" required>

                <label for="age">Age</label>
                <input type="number" id="age" name="age" placeholder="Enter age" step="any">

                <label for="image">Image URL</label>
                <input type="text" id="image" name="image" placeholder="Enter image URL">

                <label for="grade">Grade</label>
                <select id="grade" name="grade">
                    <option>Grade 4</option>
                    <option>Grade 3</option>
                    <option>Grade 2</option>
                    <option>Grade 1</option>
                    <option>Special Grade</option>
                </select>

                <div class="form-buttons">
                    <button type="submit">Create</button>
                    <a href="/sorcerers"><button type="button">Cancel</button></a>
                </div>
            </form>
        </div>
    </main>

    <footer class="footer">
        <p>Thank you for visiting the Jujutsu Kaisen Sorcerer Gallery!</p>
    </footer>
</body>
</html>
