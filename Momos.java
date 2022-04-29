public abstract class Momos
{
 final public void prepareMomos()
 {
  createDough();
  divideDough();
  rollOutDough();
  addFillings();
  streamOrFried();
  serve();
 }

public void createDough()
{
  System.out.println("Making a dough for momos...");
}
public void divideDough()
 {
  System.out.println("Divide dough into equal portions...");
 }

 public void rollOutDough()
 {
  System.out.println("Making small round shape puris for momos...");
 }

 
 abstract void streamOrFried();

 public void addFillings()
 {
  System.out.println("Add fillings of veggies...");
 }
 public void serve()
 {
  System.out.println("Serve with mayo and sauce...");
 }
} 
