# War Simulation Java

This Java project simulates a war scenario using design patterns such as BUILDER, FACTORY METHOD, and GRASP PRINCIPLE. The simulation includes a class test using Junit5 for testing.

## Overview

The project consists of a `WarSimulation` class that models a war between two kingdoms (`KingDom`). The kingdoms can be configured with various attributes such as kings, countries, soldiers, and more.

## Design Patterns Used

- **BUILDER:** Utilized for constructing complex objects (`KingDom`, `War`) step by step.
- **FACTORY METHOD:** Used for creating instances of `KingDomBuilder` and `WarBuilder`.
- **GRASP PRINCIPLE:** Applied to enhance the overall design and maintainability of the code.

## Running Tests

To run the JUnit5 tests, execute the `WarSimulationTest` class.

```bash
# Example using Maven
mvn test
```

## Test Cases

- `showKingDom`: Displays information about the kingdom structure.
- `showKingDomPower`: Checks the total power of a kingdom.
- `aKingDomHaveSoldiersOnEdges`: Verifies the placement of soldiers on kingdom edges.
- `aKingDomCanPrepareAnAttackAnOther`: Tests the preparation of kingdoms for an attack.

## Contributing

Contributions are welcome! If you'd like to contribute to the project, please follow our [contribution guidelines](CONTRIBUTING.md).

## License

This project is licensed under the [MIT License](LICENSE.md).

## Contact

For questions or feedback, please contact Saidi Imane at imanesaidi.ensa.agadir@gmail.com
```
