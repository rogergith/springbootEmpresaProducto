# Aplicacion Web Spring Boot, EmpresaProducto

Ejemplo de una Aplicacion Web hecha con Spring Boot en su version 2.0.1.RELEASE. 

La arquitectura de desarrollo esta basada en 3 capas (presentacion --> service --> repository). La capa de presentacion es un 
API Rest protegido con SpringSecurity usando Json Web Token(JWT) y la capa repository, SpringData Jpa

## Modelo Entidad Relacion del Negocio y Seguridad.

![modelo](https://user-images.githubusercontent.com/8161454/47325552-6706ae00-d632-11e8-9bd3-41306c686e80.png)

## Maven
```
mvn spring-boot:run
```

## Eclipse o STS
```
File -> Import -> Maven -> Existing Maven project
```

