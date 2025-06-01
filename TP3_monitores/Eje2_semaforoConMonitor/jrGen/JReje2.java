/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JReje2
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_delay_intTovoid;
	public Cap_ext_ JRget_op_delay_intTovoid() {
		return op_delay_intTovoid;
	}
	public void JRset_op_delay_intTovoid(Cap_ext_ op_delay_intTovoid) {
		this.op_delay_intTovoid = op_delay_intTovoid;
	}

	public Cap_ext_ op_Escritor_intTovoid;
	public Cap_ext_ JRget_op_Escritor_intTovoid() {
		return op_Escritor_intTovoid;
	}
	public void JRset_op_Escritor_intTovoid(Cap_ext_ op_Escritor_intTovoid) {
		this.op_Escritor_intTovoid = op_Escritor_intTovoid;
	}

	public JReje2(JReje2 copy)
	{
	this.op_delay_intTovoid = copy.op_delay_intTovoid;
	this.op_Escritor_intTovoid = copy.op_Escritor_intTovoid;

	}
	public JReje2(Object ... opSig)
	{
	this.op_delay_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Escritor_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JReje2(boolean dummy)	{
	    super(dummy);
	this.op_delay_intTovoid = Cap_ext_.noop;
	this.op_Escritor_intTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JReje2(true);
	}
    }
