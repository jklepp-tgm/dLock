package tgm.hit.rtn.dlock.RequestHandlers;

import tgm.hit.rtn.dlock.TransportLayer.RTNConnection;
import tgm.hit.rtn.dlock.TransportLayer.UDPLockServer.ThreadedConnection;
import tgm.hit.rtn.dlock.protocol.requests.Request;
import tgm.hit.rtn.dlock.protocol.requests.Unlock;

/**
 * @author Ari Michael Ayvazyan
 * @version 13.10.2014
 */
public class UnlockRequestHandler implements RequestListener {
    /* contains a instance of this class */
    public final static UnlockRequestHandler INSTANCE = new UnlockRequestHandler();
    private UnlockRequestHandler(){};
    @Override
    public void handleRequest(Request request, RTNConnection threadedConnection) {
        if(request instanceof Unlock){
            Unlock byeReq=(Unlock)request;
            //Because of a "Is the system locked?" request. unlock requests do not need to be handled
        }
    }
}