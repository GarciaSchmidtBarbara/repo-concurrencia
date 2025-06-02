/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JReje4
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_done_voidTovoid;
	public Cap_ext_ JRget_op_done_voidTovoid() {
		return op_done_voidTovoid;
	}
	public void JRset_op_done_voidTovoid(Cap_ext_ op_done_voidTovoid) {
		this.op_done_voidTovoid = op_done_voidTovoid;
	}

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

	public Cap_ext_ op_Lector_intTovoid;
	public Cap_ext_ JRget_op_Lector_intTovoid() {
		return op_Lector_intTovoid;
	}
	public void JRset_op_Lector_intTovoid(Cap_ext_ op_Lector_intTovoid) {
		this.op_Lector_intTovoid = op_Lector_intTovoid;
	}

	public JReje4(JReje4 copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_delay_intTovoid = copy.op_delay_intTovoid;
	this.op_Escritor_intTovoid = copy.op_Escritor_intTovoid;
	this.op_Lector_intTovoid = copy.op_Lector_intTovoid;

	}
	public JReje4(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_delay_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_Escritor_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_Lector_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);

	}
	public JReje4(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_delay_intTovoid = Cap_ext_.noop;
	this.op_Escritor_intTovoid = Cap_ext_.noop;
	this.op_Lector_intTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JReje4(true);
	}
    }
