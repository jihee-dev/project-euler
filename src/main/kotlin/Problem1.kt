/*
* 1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
* 그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
*/

fun problem1(): Int {
    var sum = 0
    for (i in 0..<1000) {
        if (i % 3 == 0 || i % 5 == 0) sum += i
    }
    return sum // 233168
}

// 수열의 합
// O(1)으로 풀 수 있다
// 이 코드가 좋은 코드인가?
