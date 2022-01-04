class GfG
 {
	String encode(String str)
	{
          //Your code here
          
          int cnt=0;
          StringBuilder ans = new StringBuilder();
          char prev = str.charAt(0);
          for(int i=0;i<str.length();i++){
              
                char c = str.charAt(i);
                if(c==prev){
                    cnt++;
                    
                }else{
                    ans.append(prev);
                    ans.append(cnt);
                    cnt=1;
                    prev = c;
                }
                
          }
          ans.append(prev);
          ans.append(cnt);
          
          return ans.toString();
	}
 }
