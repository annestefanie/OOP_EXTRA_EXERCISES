## IoT Sensor Management System

A system for monitoring and reading real-time data from networks of IoT (Internet of Things) devices, applying concepts of polymorphism, interfaces, and telemetry simulation.

### Concepts Applied
- **Interfaces**: Definition of the `Mapeavel` contract for devices that provide geolocation.
- **Polymorphism and Abstraction**: Modeling of the base class `Sensor` and its specializations (`SensorTemperature`, `SensorHumidity`).
- **Exception Handling**: Creation of the `InvalidReadingException` exception to handle sensor failures outside the operational range.
- **Telemetry Simulation**: Manipulation of lists for continuous data collection and processing.

### Project Structure
- `LeituraInvalidaException.java`: Exception thrown when a sensor reading is outside safe limits.
- `Mapeavel.java`: Interface that requires the implementation of the `getCoordinates()` method.
- `Sensor.java`: Abstract parent class with basic attributes (`id`, `location`, `status`).
- `SensorTemperature.java`: Subclass that reads temperature in Celsius and validates temperature spikes.
- `SensorUmidade.java`: Subclass for measuring relative humidity.
- `CentralDeMonitoramento.java`: Scans the sensor network and handles invalid readings.
- `Main.java`: Entry point that simulates the IoT control panel.
