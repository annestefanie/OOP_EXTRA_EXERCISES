## Checkout System and Payment Methods

An intermediate project demonstrating the use of abstraction, behavioral contracts through interfaces, and batch processing with collections and polymorphism.

### Concepts Practiced
- **Abstract Classes (`abstract class`)**: Base class `PaymentMethod` preventing direct instantiation.
- **Interfaces (`interface`)**: `Authenticatable` contract for security validation.
- **Inheritance and Polymorphism**: Overriding methods (`@Override`) for Pix and Card.
- **Collections (`List` / `ArrayList`)**: Batch iteration using a `for-each` loop.

### Project Structure
- `Authenticatable.java`: Interface with the `authenticate` method signature.
- `PaymentMethod.java`: Parent abstract class.
- `Pix.java`: Inherits from `PaymentMethod` and applies a 10% discount.
- `Card.java`: Inherits from `PaymentMethod`, implements `Authenticatable`, and adds a fixed fee.
- `CheckoutProcessor.java`: Processes a `List`.
- `Main.java`: Builds the payment queue and triggers checkout.

