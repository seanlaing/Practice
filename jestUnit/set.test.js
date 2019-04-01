const set = require('./Set');
let s 
beforeEach(() => {
  s = new set();
});

afterEach(() => {
});

test('is it empty?', () => {
	expect(s.isEmpty()).toBeTruthy();
})
test('can we add', () => {
	s.add();
	expect(s.isEmpty()).toBeFalsy();
})
