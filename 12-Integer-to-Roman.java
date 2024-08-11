class Solution {
    public String intToRoman(int num) {
        int[] iArr = {0, 0, 0, 0}; // max 4 digits (Constraints' input info)
        int digit = 0;
        
        HashMap<Integer, Character> hash = new HashMap<Integer, Character>();
        hash.put(1, 'I');
        hash.put(5, 'V');
        hash.put(10, 'X');
        hash.put(50, 'L');
        hash.put(100, 'C');
        hash.put(500, 'D');
        hash.put(1000, 'M');
        
        String s = "";
        
        // 0 -> thousands digit, 1 -> hundreds digit
        // 2 -> tens digit, 3 -> units digit
        for (int i = 3; i >= 0; i--) {
        	digit = num / ((int)Math.pow(10, i));
        	num -= digit * ((int)Math.pow(10, i));
        	iArr[3-i] = digit * ((int)Math.pow(10, i));
        }
        
        for(int i = 0; i < 4; i++) {
        	if (iArr[i] != 0) {
        		if (i == 0) { // thousands digit
        			while (iArr[i] != 0) {
        				s += hash.get(1000);
        				iArr[i] -= 1000;
        			}
        		}
        		else if (i == 1) { // hundreds digit
        			while (iArr[i] != 0) {
        				if (iArr[i] == 400) {
        					s += hash.get(100); 
        					s += hash.get(500);
        					iArr[i] -= 400;
        				}
        				else if (iArr[i] == 900) {
        					s += hash.get(100);
        					s += hash.get(1000);
        					iArr[i] -= 900;
        				}
        				else if (iArr[i] < 500) {
        					s += hash.get(100);
        					iArr[i] -= 100;
        				}
        				else {
        					s += hash.get(500);
        					iArr[i] -= 500;
        				}
        			}
        		}
        		else if (i == 2) { // tens digit
        			while (iArr[i] != 0) {
        				if (iArr[i] == 40) {
        					s += hash.get(10); 
        					s += hash.get(50);
        					iArr[i] -= 40;
        				}
        				else if (iArr[i] == 90) {
        					s += hash.get(10); 
        					s += hash.get(100);
        					iArr[i] -= 90;
        				}
        				else if (iArr[i] < 50) {
        					s += hash.get(10);
        					iArr[i] -= 10;
        				}
        				else {
        					s += hash.get(50);
        					iArr[i] -= 50;
        				}
        			}
        		}
        		else { // units digit
        			while (iArr[i] != 0) {
        				if (iArr[i] == 4) {
        					s += hash.get(1); 
        					s += hash.get(5);
        					iArr[i] -= 4;
        				}
        				else if (iArr[i] == 9) {
        					s += hash.get(1); 
        					s += hash.get(10);
        					iArr[i] -= 9;
        				}
        				else if (iArr[i] < 5) {
        					s += hash.get(1);
        					iArr[i] -= 1;
        				}
        				else {
        					s += hash.get(5);
        					iArr[i] -= 5;
        				}
        			}
        		}
        	}
        }
        
		return s;
    }
}