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

	       implementation 'com.github.Fespuna:Noads:3.0'
        
}
```

How to use the lib
```

// Set tomorrow date to avoid the check
NoAds.tdate = "2018-06-27";

if(NoAds.get()){

 //show ads

}else{

 // no show ads

}
```
