function diffArray(arr1, arr2) {
  let newArr = arr1.concat(arr2);
  return newArr.filter(item => !arr1.includes(item) 
  	|| !arr2.includes(item));
}
console.log(diffArray([1, 2, 3, 5], 
	[1, 2, 3, 4, 5]));
console.log(diffArray(["grass", "dirt", "pink wool", "dead shrub"], 
	["grass", "dirt", "dead shrub"]));
console.log(diffArray(["diorite", "andesite", "grass", "dirt", "pink wool", "dead shrub"], ["diorite",
"andesite", "grass", "dirt", "dead shrub"]) );