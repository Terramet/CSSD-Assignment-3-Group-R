
package cssd_assignment_3;

abstract class TokenReader {
	
        TokenReader(int readID, Location loc) {
            readerID = readID;
            location = loc;
        }
    
	public abstract void presentToken(Token token);
	
	private int extractTokenID(Token token) {
            return token.GetTokenID();
	}
	
	private int readerID;
	private int tokenID;
	private Location location;
}

class RFIDReader extends TokenReader {
    
    RFIDReader(int readID, Location loc, int encryptKey) {
        super(readID, loc);
        encryptionKey = encryptKey;
    }
    
    public void presentToken(Token token) {
        
    }
    
    private int encryptionKey;  
}

class BarcodeTranslator extends TokenReader {
    
    BarcodeTranslator(int readID, Location loc, int barNum) {
        super(readID, loc);
        barcodeNum = barNum;
    }
    
    public void presentToken(Token token) {
        
    }
    
    private int translateBarcode() {
        return barcodeNum;
    }
    
    private int barcodeNum;
}

class ManeticStripTranslator extends TokenReader {
    
    ManeticStripTranslator(int readID, Location loc, int encodeType) {
        super(readID, loc);
        encodingType = encodeType;
    }
    
    public void presentToken(Token token) {

    }
   
    private int encodingType;
}
