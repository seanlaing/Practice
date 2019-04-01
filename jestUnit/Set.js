class Set{
	constructor(){
		//this.__setArray = []
		this.setArray = []
		this.arrSize =0;;
	}
	isEmpty() {
		return this.arrSize ===0;
	}
	add(){
		this.arrSize++;
	}
}

module.exports = Set