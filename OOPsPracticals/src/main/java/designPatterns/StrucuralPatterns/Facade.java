package designPatterns.StrucuralPatterns;

public class Facade {
    /*
    The Facade Pattern is a structural design pattern that provides a simplified, higher-level interface
    to a complex system, making it easier for clients to interact with that system.

   ** It encapsulates the complexity of the system and provides a unified interface to access its various components.**

    Key components of the Facade Pattern:
    Facade: This is the central class of the pattern. It provides a simplified interface to the client by
           aggregating the functionality of multiple subsystem classes. The Facade class delegates
           client requests to the appropriate subsystem objects.
    Subsystems: These are individual classes or components that make up the complex system.
                The subsystem classes contain the detailed implementations of various tasks or operations.

    The primary benefits of using the Facade Pattern are:
    Simplification: It simplifies the usage of a complex system by providing a single entry point and
             a higher-level interface. Clients don't need to know the details of the subsystems.
    Decoupling: It promotes loose coupling between clients and subsystems. Changes in the
                 subsystems don't affect clients as long as the Facade's interface remains the same.
    Organization: It helps organize a large system by breaking it into smaller, manageable subsystems.
                 Each subsystem can focus on a specific area of functionality.
     */
}
