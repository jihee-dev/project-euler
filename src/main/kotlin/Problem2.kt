/*
* 피보나치(Fibonacci) 수열의 각 항은 바로 앞의 항 두 개를 더한 것입니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
* 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
* 4백만 이하의 짝수 값을 갖는 모든 피보나치 항을 더하면 얼마가 됩니까?
*/

fun problem2(): Int {
    val fibonacci = mutableListOf(1, 2, 3)
    var index = 2
    var sum = 2

    while (true) {
        val current = fibonacci[index - 1] + fibonacci[index]
        if (current > 4000000) break

        fibonacci.add(current)
        if (current % 2 == 0) sum += current
        index++
    }

    return sum // 4613732
}

/*
* 내 풀이
* 시간 복잡도 O(N)
* 공간 복잡도 O(N)
*
* 최적
* 시간 복잡도 O(log N)
* 공간 복잡도 O(1)
*
*
* N번째를 구하는 거면 O(N)
* N보다 작은 걸 구하는 거라서 O(log N)
* x + y
*/
