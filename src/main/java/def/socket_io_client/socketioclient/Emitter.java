package def.socket_io_client.socketioclient;
import def.js.Function;
/**
	 * The base emiter class, used by Socket and Manager
	 */
@jsweet.lang.Interface
public abstract class Emitter extends def.js.Object {
    /**
		 * Adds a listener for a particular event. Calling multiple times will add
		 * multiple listeners
		 * @param event The event that we're listening for
		 * @param fn The function to call when we get the event. Parameters depend on the
		 * event in question
		 * @return This Emitter
		 */
    native public Emitter on(String event, Function fn);
    /**
		 * @see on( event, fn )
		 */
    native public Emitter addEventListener(String event, Function fn);
    /**
		 * Adds a listener for a particular event that will be invoked
		 * a single time before being automatically removed
		 * @param event The event that we're listening for
		 * @param fn The function to call when we get the event. Parameters depend on
		 * the event in question
		 * @return This Emitter
		 */
    native public Emitter once(String event, Function fn);
    /**
		 * Removes a listener for a particular type of event. This will either
		 * remove a specific listener, or all listeners for this type of event
		 * @param event The event that we want to remove the listener of
		 * @param fn The function to remove, or null if we want to remove all functions
		 * @return This Emitter
		 */
    native public Emitter off(String event, Function fn);
    /**
		 * @see off( event, fn )
		 */
    native public Emitter removeListener(String event, Function fn);
    /**
		 * @see off( event, fn )
		 */
    native public Emitter removeEventListener(String event, Function fn);
    /**
		 * Removes all event listeners on this object
		 * @return This Emitter
		 */
    native public Emitter removeAllListeners();
    /**
		 * Emits 'event' with the given args
		 * @param event The event that we want to emit
		 * @param args Optional arguments to emit with the event
		 * @return Emitter
		 */
    native public Emitter emit(String event, Object... args);
    /**
		 * Returns all the callbacks for a particular event
		 * @param event The event that we're looking for the callbacks of
		 * @return An array of callback Functions, or an empty array if we don't have any
		 */
    native public Function[] listeners(String event);
    /**
		 * Returns if we have listeners for a particular event
		 * @param event The event that we want to check if we've listeners for
		 * @return True if we have listeners for this event, false otherwise
		 */
    native public Boolean hasListeners(String event);
    /**
		 * Removes a listener for a particular type of event. This will either
		 * remove a specific listener, or all listeners for this type of event
		 * @param event The event that we want to remove the listener of
		 * @param fn The function to remove, or null if we want to remove all functions
		 * @return This Emitter
		 */
    native public Emitter off(String event);
    /**
		 * @see off( event, fn )
		 */
    native public Emitter removeListener(String event);
    /**
		 * @see off( event, fn )
		 */
    native public Emitter removeEventListener(String event);
}

