
// Empleado
class Empleado ( var nombre: String, var ingresoBase : Double)


// Empleado de Planta
class EmpleadoPlanta (var descuentosMes: Double)
{
  def PagoMensual(base: Double) : Double =
  {
    base * (descuentosMes) // kinda
  }
}


// Contratista
class Contratista (var reporteTiempo : Int)
{
  def PagoMensual(base: Double): Double =
  {
    base * (reporteTiempo) // kinda
  }
}


// Vendedor Planta
class VendedorPlanta (var reporteVentas : Double)


// Vendedor Externo
class VendedorExterno (var reporteVentas : Double)


// Mixin
trait reporteVentas
{

}

@main
def main(): Unit =
{
  println("Hello world!")
}