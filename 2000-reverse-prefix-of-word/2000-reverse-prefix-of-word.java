class Solution {
    public String reversePrefix(String word, char ch) {

        int i = word.indexOf(ch);

        if(i != -1){
            String segment = word.substring(0,i+1);
            StringBuilder reversed = new StringBuilder(segment);
            reversed.reverse();
            String result = reversed.toString() + word.substring(i+1);
            return result;
        }
        else{
            return word;
        }
        
    }
}