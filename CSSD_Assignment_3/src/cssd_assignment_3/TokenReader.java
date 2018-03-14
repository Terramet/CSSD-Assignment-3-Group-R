
package cssd_assignment_3;

abstract class TokenReader {
	
        TokenReader(int readID, Location loc, GateController gateControl) {
            readerID = readID;
            location = loc;
            gateController = gateControl;
        }
    
	public abstract void presentToken(Token token);
	
	private int extractTokenID(Token token) {
            return token.GetTokenID();
	}
	
	private int readerID;
	private int tokenID;
	private Location location;
        final GateController gateController;
}

class RFIDReader extends TokenReader {
    
    RFIDReader(int readID, Location loc, int encryptKey, GateController gateControl) {
        super(readID, loc, gateControl);
        encryptionKey = encryptKey;
    }
    
    public void presentToken(Token token) {
        gateController.passTokenID(token.GetTokenID());
    }
    
    private int encryptionKey;  
}

class BarcodeTranslator extends TokenReader {
    
    BarcodeTranslator(int readID, Location loc, int barNum, GateController gateControl) {
        super(readID, loc, gateControl);
        barcodeNum = barNum;
    }
    
    public void presentToken(Token token) {
        gateController.passTokenID(token.GetTokenID());
    }
    
    private int translateBarcode() {
        return barcodeNum;
    }
    
    private int barcodeNum;
}

class ManeticStripTranslator extends TokenReader {
    
    ManeticStripTranslator(int readID, Location loc, int encodeType, GateController gateControl) {
        super(readID, loc, gateControl);
        encodingType = encodeType;
    }
    
    public void presentToken(Token token) { 
        gateController.passTokenID(token.GetTokenID());
    }
   
    private int encodingType;
}
