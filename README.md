# CSC340-CRUD-API

## API Endpoints

Base path: `/api/sorcerers`

- `GET /api/sorcerers/test` — Returns the string `"Test from SorcererController"`.
- `GET /api/sorcerers` — Returns all sorcerers.
- `GET /api/sorcerers/{id}` — Returns the sorcerer with the given ID, or `404 Not Found` if it doesn't exist.
- `POST /api/sorcerers` — Creates a new sorcerer and returns it.
- `PUT /api/sorcerers/{id}` — Updates the sorcerer with the given ID and returns it, or `404 Not Found` if it doesn't exist.
- `DELETE /api/sorcerers/{id}` — Deletes the sorcerer with the given ID and returns `204 No Content`, or `404 Not Found` if it doesn't exist.
- `GET /api/sorcerers/search?query={keyword}` — Returns sorcerers whose name or description matches the search query.
- `GET /api/sorcerers/grade?name={grade}` — Returns sorcerers matching the given grade.

Deployed Web Service: [https://csc340-crud-api.onrender.com](https://csc340-crud-api.onrender.com)