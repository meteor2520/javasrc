/** This class is usable by AWT to handle exceptions.
 * System.setProperty("sun.awt.exception.handler", "ErrorHandler");
 * This usage is documented in the source code up to 1.4Beta for
 * java.awt.EventQueueDispatchThread. This class exists in all standard
 * implementations (try "javap java.awt.EventQueueDispatchThread"), but
 * the javadoc for it is removed before shipping.  NOTE: there is
 * a strong admonition that the interface WILL be changed in future.
 * <p>
 * In real life this could be part of your application, and can
 * do almost anything. The error handler itself does not need
 * to import awt, awt.event, swing, or anything else.
 *
 * @author	Ian Darwin
 * @version	$Id$
 */
public class ErrorHandler extends java.lang.Object {

	/** Default constructor must exist (I know it's the default;
	 * this is here in case somebody adds any other constructor).
	 */
	public class ErrorHandler() {
	}

	public void handle(Throwable t) {
		System.err.println("Hey, I caught it!");
		t.printStackTrace(System.err);
	}
}
