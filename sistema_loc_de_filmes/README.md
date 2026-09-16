## Movie and Video Game Rental System

A project focused on managing a rental store’s inventory, using inheritance to share media attributes, polymorphism to calculate differentiated daily rental rates, and control item availability.

### Concepts Applied
- **Inheritance and Code Reuse**: Creation of a hierarchy where `Movies` and `VideoGames` share characteristics of rentable media/items.
- **Method Overriding (`@Override`)**: Specific rules for calculating rental prices and displaying details by media type.
- **State and Collection Management**: Tracking available and rented items within the rental store’s inventory.

### Project Structure
- `Filmes.java`: Represents movie titles, containing specific attributes such as runtime, genre, and daily rental price rules.
- `VideoGames.java`: Represents video games, containing attributes such as platform (console) and daily rental price multipliers.
- `RentalStore.java`: Manages the inventory, the rental/return process, and searches for available media.
- `Main.java`: The system’s entry point for populating the catalog and simulating rentals.
