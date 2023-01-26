Crear una aplicacićión para gestionar las tarjetas regalo de un comercio.
Para ello, implementaremos la clase TarjetaRegalo, con las siguientes características:

#### Atributos:
- **Saldo** - El saldo de la tarjeta.
- **Identificador** - Un Integer de 5 dígitos.

#### Métodos:
- Un **constructor** que recibirá como parámetro el saldo se lo carga a la tarjeta y 
se asigna de forma automática el Identificador. 
- **gastarSaldo**: Para gastar parte o todo el saldo de la tarjeta. Si se intenta gastar 
más dinero del que tiene la tarjeta, se debe mostrar un mensaje de error. 
- **combinarTarjetas**: Dos tarjetas regalo se pueden fusionar creando una nueva 
  tarjeta con la suma del saldo que tenga cada una y un nuevo identificador. Tras la fusión, 
  las dos tarjetas originales se quedarían con 0 € de saldo.
  Ejemplo:
  ```java
  TarjetaRegalo tarjetaUno = new TarjetaRegalo(50);
  TarjetaRegalo tarjetaDos = new TarjetaRegalo(25);
  TarjetaRegalo tarjetaNueva = tarjetaUno.combinar(tarjetaDos);
  ```
  
- Además, se crearán los **getter** y **setter** necesarios.

## SOLUCIÓN:
```java
package tarjetaregalo;

import java.util.Random;

public class TarjetaRegalo {
    private Integer saldo;
    private Integer codigo;
    
    public TarjetaRegalo(final Integer saldo) {
        setSaldo(saldo); 
        Random pepe = new Random();       
        codigo = pepe.nextInt(90000) + 10000;       
    }

    public Integer getSaldo() {
        return saldo;
    }

    public Integer getCodigo() {
        return codigo;
    }
    

    public void setSaldo(final Integer saldo) {
        this.saldo = saldo;
    }

    public void setCodigo(final Integer codigo) {
        this.codigo = codigo;
    }

    public TarjetaRegalo combinarTarjeta(TarjetaRegalo tarjetaDos){
        int saldoTres = tarjetaDos.getSaldo() + getSaldo();
        TarjetaRegalo tarjetaTres = new TarjetaRegalo(saldoTres);
        tarjetaDos.setSaldo(0);
        setSaldo(0);
        return tarjetaTres;

    }

}
```

