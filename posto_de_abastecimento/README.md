<h2>Fleet and Fuel Management System</h2> 
<p>A project that integrates custom exception handling, dynamic type checking, and supply limit control.</p>

#### Concepts Covered
- **Custom Exceptions**: Creating and throwing the `TanqueExcedidoException`, which inherits from `Exception`.
- **Error Handling (`try-catch` and `throw/throws`)**: Capturing and resiliently handling runtime errors.
- **`instanceof` Operator and Casting**: Identification and dynamic conversion of objects (`Eletrico`).
- **Polymorphism and Abstraction**: Complete modeling of the vehicle hierarchy (`Caminhao` and `CarroEletrico`).

#### Project Structure
- `TanqueExcedidoException.java`: Custom exception for fuel capacity overflow.
- `Eletrico.java`: Interface for battery charging.
- `Veiculo.java`: Abstract class with basic refueling rules and exception handling.
- `Truck.java`: Fuel-based subclass.
- `ElectricCar.java`: Electric subclass that blocks liquid fuel.
- `FuelingStation.java`: Manages the fleet using a `try-catch` block and `instanceof`.
- `Main.java`: Simulates fleet service.
