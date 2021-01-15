_A.methodA:
	BeginFunc 16;
	_t0 = *(this + 4);
	_t1 = a + _t0;
	_t2 = 10;
	_t3 = _t1 * _t2;
	_v0 = _t3;  //register that keeps return value
	EndFunc;
VTable A = _A.methodA, ;


_B.methodB :
	BeginFunc 28;
	_t0 = *(this + 8);
	_t1 = param + _t0;
	_t2 = *(this);
	_t3 = *(_t2);
	_t4 = 6;
	PushParam _t4;
	_t5 = ACall _t3;
	PopParams 4;
	_t6 = _t1 * _t5;
	_v0 = _t6;
	EndFunc;
VTable B = _A.methodA, _B.methodB, ;

main:
	BeginFunc 28;
	_t0 = 12;
	PushParam _t0;
	b = LCall_Alloc;
	PopParams 4;
	_t1 = B();
	*b = _t1;
	_t0 = 5;
	*(b + 4) = _t0;
	_t0 = 10;
	*(b + 8) = _t0;
	_t0 = 4;
	PushParam _t0;
	x = LCall_Alloc;
	PopParams 4;
	_t1 = *(b)  // pointer to vtable
	_t2 = *(_t1 + 4) //pointer to _B.methodB in vtable B
	_t0 = 2;
	PushParam _t0;
	*x = ACall _t2;
	PopParams 4;
	EndFunc;
	

