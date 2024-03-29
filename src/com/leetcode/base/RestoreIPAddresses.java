package com.leetcode.base;

import java.util.ArrayList;
import java.util.List;

//93	�ָ�IP��ַ
public class RestoreIPAddresses {

	  public List<String> restoreIpAddresses(String s) {
	        List<String> res = new ArrayList<String>();
	        helper(s, 0, "", res);
	        return res;
	    }
	    public void helper(String s, int n, String out, List<String> res) {
	        if (n == 4) {
	            if (s.isEmpty()) res.add(out);
	            return;
	        }
	        for (int k = 1; k < 4; ++k) {
	            if (s.length() < k) break;
	            int val = Integer.parseInt(s.substring(0, k));
	            if (val > 255 || k != String.valueOf(val).length()) continue;
	            helper(s.substring(k), n + 1, out + s.substring(0, k) + (n == 3 ? "" : "."), res);
	        }
	    }

}
