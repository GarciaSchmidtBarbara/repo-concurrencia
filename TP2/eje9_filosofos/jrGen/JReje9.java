/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JReje9
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

	public Cap_ext_ op_Filosofo_intTovoid;
	public Cap_ext_ JRget_op_Filosofo_intTovoid() {
		return op_Filosofo_intTovoid;
	}
	public void JRset_op_Filosofo_intTovoid(Cap_ext_ op_Filosofo_intTovoid) {
		this.op_Filosofo_intTovoid = op_Filosofo_intTovoid;
	}

	public Cap_ext_ op_comer_intXintTovoid;
	public Cap_ext_ JRget_op_comer_intXintTovoid() {
		return op_comer_intXintTovoid;
	}
	public void JRset_op_comer_intXintTovoid(Cap_ext_ op_comer_intXintTovoid) {
		this.op_comer_intXintTovoid = op_comer_intXintTovoid;
	}

	public Cap_ext_ op_pensar_intXintTovoid;
	public Cap_ext_ JRget_op_pensar_intXintTovoid() {
		return op_pensar_intXintTovoid;
	}
	public void JRset_op_pensar_intXintTovoid(Cap_ext_ op_pensar_intXintTovoid) {
		this.op_pensar_intXintTovoid = op_pensar_intXintTovoid;
	}

	public Cap_ext_ op_mutexV_voidTovoid;
	public Cap_ext_ JRget_op_mutexV_voidTovoid() {
		return op_mutexV_voidTovoid;
	}
	public void JRset_op_mutexV_voidTovoid(Cap_ext_ op_mutexV_voidTovoid) {
		this.op_mutexV_voidTovoid = op_mutexV_voidTovoid;
	}

	public JReje9(JReje9 copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_Filosofo_intTovoid = copy.op_Filosofo_intTovoid;
	this.op_comer_intXintTovoid = copy.op_comer_intXintTovoid;
	this.op_pensar_intXintTovoid = copy.op_pensar_intXintTovoid;
	this.op_mutexV_voidTovoid = copy.op_mutexV_voidTovoid;

	}
	public JReje9(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Filosofo_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_comer_intXintTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_pensar_intXintTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_mutexV_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JReje9(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_Filosofo_intTovoid = Cap_ext_.noop;
	this.op_comer_intXintTovoid = Cap_ext_.noop;
	this.op_pensar_intXintTovoid = Cap_ext_.noop;
	this.op_mutexV_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JReje9(true);
	}
    }
