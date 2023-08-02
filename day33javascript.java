
		// Online Javascript Editor for free
		// Write, Edit and Run your Javascript code using JS Online Compiler
		let names = ["satya","koka",23,35]
		let info = { "firstname":"satya", "lastname":"koka", "age" : 23, "rollNo" : 35}
		// retrive (dot notation and bracket notation)
		console.log(info.firstname)
		console.log(info['firstname'])
		// add (dot notation and bracket notation)
		info.city = "hyderabad"
		info['language'] = "hindi"
		console.log(info)
		// update (dot notation and bracket notation)
		info.city = "vijayawada"
		info['language'] = "telugu"
		console.log(info)
		// delete (dot notation and bracket notation)
		delete info.city 
		delete info['language']
		console.log(info)

	

// ouput
		node /tmp/BxU7jE88ig.js
		satya
		satya
		{
		  firstname: 'satya',
		  lastname: 'koka',
		  age: 23,
		  rollNo: 35,
		  city: 'hyderabad',
		  language: 'hindi'
		}
		{
		  firstname: 'satya',
		  lastname: 'koka',
		  age: 23,
		  rollNo: 35,
		  city: 'vijayawada',
		  language: 'telugu'
		}
		{ firstname: 'satya', lastname: 'koka', age: 23, rollNo: 35 }
	
