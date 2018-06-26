# NoAds

This is a "private" respository for personal use.
--------------------

How to get the lib
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
}
  
dependencies {

	        implementation 'com.github.Fespuna:NoAds:1.0'
        
}
```

How to use the lib
```
NoAds.tdate = "2018-06-27";

if(NoAds.get()){

 //show ads

}else{

 // no show ads

}
```
