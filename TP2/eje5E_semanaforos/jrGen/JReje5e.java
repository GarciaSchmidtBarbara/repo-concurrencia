/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JReje5e
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

	public Cap_ext_ op_PConsumer_intTovoid;
	public Cap_ext_ JRget_op_PConsumer_intTovoid() {
		return op_PConsumer_intTovoid;
	}
	public void JRset_op_PConsumer_intTovoid(Cap_ext_ op_PConsumer_intTovoid) {
		this.op_PConsumer_intTovoid = op_PConsumer_intTovoid;
	}

	public Cap_ext_ op_PProducer_intTovoid;
	public Cap_ext_ JRget_op_PProducer_intTovoid() {
		return op_PProducer_intTovoid;
	}
	public void JRset_op_PProducer_intTovoid(Cap_ext_ op_PProducer_intTovoid) {
		this.op_PProducer_intTovoid = op_PProducer_intTovoid;
	}

	public Cap_ext_ op_pausa_intTovoid;
	public Cap_ext_ JRget_op_pausa_intTovoid() {
		return op_pausa_intTovoid;
	}
	public void JRset_op_pausa_intTovoid(Cap_ext_ op_pausa_intTovoid) {
		this.op_pausa_intTovoid = op_pausa_intTovoid;
	}

	public Cap_ext_ op_mutexC_voidTovoid;
	public Cap_ext_ JRget_op_mutexC_voidTovoid() {
		return op_mutexC_voidTovoid;
	}
	public void JRset_op_mutexC_voidTovoid(Cap_ext_ op_mutexC_voidTovoid) {
		this.op_mutexC_voidTovoid = op_mutexC_voidTovoid;
	}

	public Cap_ext_ op_mutexP_voidTovoid;
	public Cap_ext_ JRget_op_mutexP_voidTovoid() {
		return op_mutexP_voidTovoid;
	}
	public void JRset_op_mutexP_voidTovoid(Cap_ext_ op_mutexP_voidTovoid) {
		this.op_mutexP_voidTovoid = op_mutexP_voidTovoid;
	}

	public Cap_ext_ op_puedoConsumir_voidTovoid;
	public Cap_ext_ JRget_op_puedoConsumir_voidTovoid() {
		return op_puedoConsumir_voidTovoid;
	}
	public void JRset_op_puedoConsumir_voidTovoid(Cap_ext_ op_puedoConsumir_voidTovoid) {
		this.op_puedoConsumir_voidTovoid = op_puedoConsumir_voidTovoid;
	}

	public JReje5e(JReje5e copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_PConsumer_intTovoid = copy.op_PConsumer_intTovoid;
	this.op_PProducer_intTovoid = copy.op_PProducer_intTovoid;
	this.op_pausa_intTovoid = copy.op_pausa_intTovoid;
	this.op_mutexC_voidTovoid = copy.op_mutexC_voidTovoid;
	this.op_mutexP_voidTovoid = copy.op_mutexP_voidTovoid;
	this.op_puedoConsumir_voidTovoid = copy.op_puedoConsumir_voidTovoid;

	}
	public JReje5e(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_PConsumer_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_PProducer_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_pausa_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_mutexC_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_mutexP_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_puedoConsumir_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);

	}
	public JReje5e(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_PConsumer_intTovoid = Cap_ext_.noop;
	this.op_PProducer_intTovoid = Cap_ext_.noop;
	this.op_pausa_intTovoid = Cap_ext_.noop;
	this.op_mutexC_voidTovoid = Cap_ext_.noop;
	this.op_mutexP_voidTovoid = Cap_ext_.noop;
	this.op_puedoConsumir_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JReje5e(true);
	}
    }
