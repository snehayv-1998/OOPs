package designPatterns.StrucuralPatterns;

public class Proxy {
    /*
    The Proxy Pattern is a structural design pattern that provides a surrogate or placeholder
    for another object to control access to it. It is often used when you want to add some level
    of control over how an object is accessed or when you want to add some additional behavior
    before or after accessing an object.
    ****The proxy can be thought of as an intermediary that stands between the client and the real subject.****

    Key components of the Proxy Pattern:
    Subject: This is the interface or abstract class representing the real object and defines the common interface
             that both the RealSubject and Proxy classes must implement.
             It usually contains the core functionality that the Proxy and RealSubject share.

    RealSubject: This is the class that represents the real object, the one the Proxy is designed to protect or enhance.
               It implements the Subject interface and provides the actual implementation of the core functionality.

     Proxy: This is the class that acts as a substitute for the RealSubject.
           It implements the Subject interface and controls access to the RealSubject.
           The Proxy can add additional functionality, such as lazy loading, access control,
           logging, or caching, without changing the RealSubject's code.
     */
}
