/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JReje6
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

	public Cap_ext_ op_proceso_intTovoid;
	public Cap_ext_ JRget_op_proceso_intTovoid() {
		return op_proceso_intTovoid;
	}
	public void JRset_op_proceso_intTovoid(Cap_ext_ op_proceso_intTovoid) {
		this.op_proceso_intTovoid = op_proceso_intTovoid;
	}

	public Cap_ext_ op_pausa_intTovoid;
	public Cap_ext_ JRget_op_pausa_intTovoid() {
		return op_pausa_intTovoid;
	}
	public void JRset_op_pausa_intTovoid(Cap_ext_ op_pausa_intTovoid) {
		this.op_pausa_intTovoid = op_pausa_intTovoid;
	}

	public Cap_ext_ op_mutex_voidTovoid;
	public Cap_ext_ JRget_op_mutex_voidTovoid() {
		return op_mutex_voidTovoid;
	}
	public void JRset_op_mutex_voidTovoid(Cap_ext_ op_mutex_voidTovoid) {
		this.op_mutex_voidTovoid = op_mutex_voidTovoid;
	}

	public JReje6(JReje6 copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_proceso_intTovoid = copy.op_proceso_intTovoid;
	this.op_pausa_intTovoid = copy.op_pausa_intTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;

	}
	public JReje6(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_proceso_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_pausa_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);

	}
	public JReje6(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_proceso_intTovoid = Cap_ext_.noop;
	this.op_pausa_intTovoid = Cap_ext_.noop;
	this.op_mutex_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JReje6(true);
	}
    }
