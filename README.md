# Application

- Implement an API query and transform this data into a csv file
- The program takes this string and queries with it our Location JSON API:
- The app should use this API endpoint:
  - http://api.goeuro.com/api/v2/position/suggest/en/STRING
  - Where STRING is the string that the user has entered as a parameter when calling the tool.
  - The API endpoint returns JSON documents like these:
  ```
 [  
   {  
      _id:377078,
      key:null,
      name:"Potsdam",
      fullName:"Potsdam, Germany",
      iata_airport_code:null,
      type:"location",
      country:"Germany",
      geo_position:{  
         latitude:52.39886,
         longitude:13.06566
      },
      location_id:377078,
      inEurope:true,
      countryCode:"DE",
      coreCountry:true,
      distance:null
   },
   {  
      _id:410978,
      key:null,
      name:"Potsdam",
      fullName:"Potsdam, USA",
      iata_airport_code:null,
      type:"location",
      country:"USA",
      geo_position:{  
         latitude:44.66978,
         longitude:-74.98131
      },
      location_id:410978,
      inEurope:false,
      countryCode:"US",
      coreCountry:false,
      distance:null
   }
]
```
# How to run the application
- Create ouput Directory [To store the ouput response from the API saved in CSV format]
- Create logs directory [To store logs]
- Execute the goEuroApp.jar as following:
  - java -jar goEuroApp.jar "STRING" 
  

# Application Tools
- It implmented using Java 1.7 Using maven

