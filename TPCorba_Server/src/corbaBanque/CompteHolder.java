package corbaBanque;

/**
* corbaBanque/CompteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Banque.idl
* Wednesday, January 17, 2018 3:21:37 PM EST
*/

public final class CompteHolder implements org.omg.CORBA.portable.Streamable
{
  public corbaBanque.Compte value = null;

  public CompteHolder ()
  {
  }

  public CompteHolder (corbaBanque.Compte initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corbaBanque.CompteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corbaBanque.CompteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corbaBanque.CompteHelper.type ();
  }

}
