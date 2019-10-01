package Recursion3;

import java.util.Arrays;

import Recursion.TakeData;

public class BinarySearch {
//	225
//	9 10 12 14 19 19 25 26 31 33 33 34 36 37 40 42 43 43 43 45 45 50 52 53 56 56 57 58 58 59 60 61 62 80 83 83 84 84 99 103 103 105 105 105 108 110 114 116 116 121 124 124 127 129 132 136 136 137 143 150 150 151 152 152 160 161 162 163 164 169 172 172 175 176 177 181 184 187 189 191 192 194 196 196 197 203 209 209 210 212 212 213 213 220 224 231 232 235 241 243 249 249 250 254 257 258 260 261 264 265 265 267 272 275 278 279 280 281 282 285 285 290 291 294 296 299 301 301 302 305 306 308 309 311 311 320 322 325 327 328 330 331 332 333 333 334 336 338 339 343 343 346 348 350 351 353 356 358 361 363 365 366 367 368 369 370 372 373 375 375 375 378 382 384 387 387 389 391 393 396 397 398 401 402 408 409 409 412 419 427 429 429 430 431 432 436 436 436 437 438 439 440 440 445 445 452 454 455 455 460 464 466 479 482 482 483 485 486 489 489 492 494 497 499 500 
//	436	
//	196
	
//	302
//	6 6 7 10 11 12 13 14 15 18 18 19 22 23 25 26 26 30 35 35 36 39 40 42 46 46 47 48 49 49 51 51 52 54 56 58 58 58 59 61 61 66 66 69 71 72 75 75 76 77 78 81 82 84 85 92 93 95 95 97 98 98 100 105 106 107 108 108 110 115 115 117 118 118 119 119 122 123 124 129 132 133 137 139 143 144 144 145 147 148 149 150 151 156 157 158 158 163 167 167 170 174 174 175 176 176 178 181 181 182 182 184 186 190 194 195 196 198 200 202 203 206 207 207 207 208 209 210 210 211 211 212 213 214 214 217 217 221 224 226 228 229 230 233 234 235 238 238 238 240 242 242 243 243 244 246 247 249 251 254 256 257 257 260 262 264 268 273 273 273 276 277 278 281 281 282 282 282 283 284 284 286 292 293 299 305 306 311 311 312 313 316 320 323 324 325 330 337 337 341 345 350 352 353 355 357 357 358 358 360 365 365 365 367 367 369 370 370 371 372 374 376 378 379 379 382 385 388 388 389 389 394 395 396 396 396 398 399 400 401 402 403 404 405 405 408 415 417 418 418 418 421 424 426 426 428 428 434 437 439 440 441 443 444 445 449 449 451 452 452 454 454 456 458 461 465 466 468 470 472 473 473 475 479 479 480 480 481 483 484 485 488 488 489 489 492 493 493 493 494 496 499 
//	198
//	117
	
//	127
//	26 27 31 31 31 32 37 38 44 44 47 51 52 58 69 70 71 73 83 84 91 94 95 97 103 104 106 111 118 130 132 134 140 141 144 148 162 163 166 175 179 180 181 182 183 184 184 185 186 190 192 195 197 199 204 209 211 214 216 218 222 232 239 242 244 245 248 250 258 258 268 270 274 276 277 291 295 297 301 302 312 313 316 322 328 331 333 334 335 337 347 350 350 353 353 354 357 358 363 364 369 382 390 393 396 400 401 403 414 418 419 421 424 430 432 440 444 464 464 467 479 488 490 492 492 495 500 
//	202
//	-1
	public static int binarySearchItrH(int input[], int element,int start,int end) {
	    System.out.println(" start : "+start+" end : "+end);
		int m = (end-start)/2;
		m = start + m;
		if(end<start) {
			return -1;
		}
    	System.out.println("Updated Mid : "+m); 
	    if(start !=0 && end ==6) {
	    	System.out.println("Right Array");
	    	for(int i=start;i<end;i++) {
	    		System.out.print(input[i]+ " ");
	    	}
	    	System.out.println("Mid index : "+m+" Mid Value : "+input[m]);
	    }
	    if(end !=6 && start==0) {
	    	System.out.println("Left Array");
	    	for(int i=start;i<end;i++) {
	    		System.out.print(input[i]+ " ");
	    	}
            
	    	System.out.println("Mid index : "+m+" Mid Value : "+input[m]);
	    }
//	    System.out.println("Mid :"+m+" Mid Value :"+input[m]+" s :"+start+" end :"+end);
		if(input[m]==element) {
			System.out.println("M : "+m+" Value : "+input[m]);
			return m;
		}
		if(input[m]>element) {
			int Sl = start;
			int El = m-1;
			return binarySearchItrH(input, element, Sl, El);
		}
		else {
			int Sr=m+1;
			int Er=end;
			return binarySearchItrH(input, element, Sr, Er);
		}
	}
	public static int  binarySearchItr(int input[], int element) {
		System.out.println("M : "+input[input.length/2 ]+" Lenght : "+input.length+" "+binarySearchItrH(input, element, 0,input.length));
		return 0;
	}
	static int ans=0;
	public static void binarySearchH(int input[], int element,int E) {
	    if(input.length==1 || element==input.length) {
	        
	    	return ;
	    }
	   
//	   
	    System.out.println(input[element]+"  "+element);
	    if(input[element]==E) {
		 	   System.out.println("e "+element+"  A[e] :"+input[element]+"  E : "+E+"  ANS :"+ans);
		 	    	return ;
		 	    } 
	    binarySearchH(input, element+1,E);
	  
	    ans++; 
		return ; 
	}
	public static int binarySearch(int input[], int element) {
	     binarySearchH(input,0,element);
	
		return ans; 
	}
	public static void main(String[] args) {
	int n = TakeData.TakeInt();	
	int A[] = new int[n];
	for (int i=0;i<A.length;i++) {
		A[i]=TakeData.TakeInt();
	}
	int e = TakeData.TakeInt();
//    System.out.println("Ans :"+	binarySearch(A, e));
    binarySearchItr(A, e);
//	System.out.println("ANS2 : "+Arrays.binarySearch(A, 436)+Arrays.search);
    }
}
