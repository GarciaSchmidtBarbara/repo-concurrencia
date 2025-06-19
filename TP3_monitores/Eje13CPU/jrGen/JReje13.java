/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JReje13
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

	public Cap_ext_ op_Proceso_intTovoid;
	public Cap_ext_ JRget_op_Proceso_intTovoid() {
		return op_Proceso_intTovoid;
	}
	public void JRset_op_Proceso_intTovoid(Cap_ext_ op_Proceso_intTovoid) {
		this.op_Proceso_intTovoid = op_Proceso_intTovoid;
	}

	public JReje13(JReje13 copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_delay_intTovoid = copy.op_delay_intTovoid;
	this.op_Proceso_intTovoid = copy.op_Proceso_intTovoid;

	}
	public JReje13(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_delay_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_Proceso_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JReje13(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_delay_intTovoid = Cap_ext_.noop;
	this.op_Proceso_intTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JReje13(true);
	}
    }
