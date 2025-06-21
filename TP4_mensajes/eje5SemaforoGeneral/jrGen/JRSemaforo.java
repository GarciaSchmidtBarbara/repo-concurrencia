/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRSemaforo
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_pausa_intTovoid;
	public Cap_ext_ JRget_op_pausa_intTovoid() {
		return op_pausa_intTovoid;
	}
	public void JRset_op_pausa_intTovoid(Cap_ext_ op_pausa_intTovoid) {
		this.op_pausa_intTovoid = op_pausa_intTovoid;
	}

	public Cap_ext_ op_Proceso_intTovoid;
	public Cap_ext_ JRget_op_Proceso_intTovoid() {
		return op_Proceso_intTovoid;
	}
	public void JRset_op_Proceso_intTovoid(Cap_ext_ op_Proceso_intTovoid) {
		this.op_Proceso_intTovoid = op_Proceso_intTovoid;
	}

	public Cap_ext_ op_semaforoGeneral_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_semaforoGeneral_javadotlangdotStringTovoid() {
		return op_semaforoGeneral_javadotlangdotStringTovoid;
	}
	public void JRset_op_semaforoGeneral_javadotlangdotStringTovoid(Cap_ext_ op_semaforoGeneral_javadotlangdotStringTovoid) {
		this.op_semaforoGeneral_javadotlangdotStringTovoid = op_semaforoGeneral_javadotlangdotStringTovoid;
	}

	public JRSemaforo(JRSemaforo copy)
	{
	this.op_pausa_intTovoid = copy.op_pausa_intTovoid;
	this.op_Proceso_intTovoid = copy.op_Proceso_intTovoid;
	this.op_semaforoGeneral_javadotlangdotStringTovoid = copy.op_semaforoGeneral_javadotlangdotStringTovoid;

	}
	public JRSemaforo(Object ... opSig)
	{
	this.op_pausa_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Proceso_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_semaforoGeneral_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRSemaforo(boolean dummy)	{
	    super(dummy);
	this.op_pausa_intTovoid = Cap_ext_.noop;
	this.op_Proceso_intTovoid = Cap_ext_.noop;
	this.op_semaforoGeneral_javadotlangdotStringTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRSemaforo(true);
	}
    }
