//create an array
const nums = [23, 32, 54, -1];
console.log(nums);

//create an array with Array constructor
const nums2 = new Array(2,4,5,6,7);

//Array.isArray(myArray)
//return boolean
console.log(Array.isArray(nums));

//Arrays can hold many different data types

const variedData = [new Date(), "wow", 3.64, null, undefined];
console.log(variedData);

//print out the number of elements or use in loop
// check the .length is a property/field
console.log(variedData.length);

//change the first element in nums array to 999
nums[0] = 999;

// change tha last element  in the nums array to 999
nums[nums.length - 1] = 999;
console.log(nums)

//use traditional loop to display all the elements in an array
const sports = ["football", "soccer", "swimming", "basketball"];
for(let index = 0; index < sports.length; index++)
{
    console.log(sports[index]);
}

console.log("-----------------");
console.log("-----------------");
console.log("-----------------");

//for each loop cycle through and print out each element
for (let element of sports)
{
    console.log(element);
}

console.log("-----------------");

// for in loop cycle thhrough sports and print out index and element
for(let index in sports)
{
    console.log(index + " " + sports[index]);
}

// Array Methods - Adding to Array push(adds to the end) 
// and unshift(adds to the beginning)
//add hiking to the front of the array
sports.unshift("hiking");

console.log(sports);

//add biking to the end
sports.push("biking");
console.log(sports);

//remove from beginning use shift()
//remove from end use pop()
sports.pop();
console.log(sports);

sports.shift();
console.log(sports);

//reverse array by using 
sports.reverse();
console.log(sports);

//sorting
console.log(sports.sort());