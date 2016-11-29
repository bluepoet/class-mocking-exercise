package net.bluepoet.mock

import spock.lang.Specification

import static org.mockito.Mockito.*

/**
 * Created by bluepoet on 2016. 11. 29..
 */
class ClassMockTest extends Specification {
    User user = mock(User.class)

    def "User clsss mocking뒤 실행 후, 검증성공을 확인한다."() {
        given:
        when(user.hello()).thenReturn('mock hello')

        when:
        def result = user.hello()

        then:
        { verify(user, times(1)).hello() }
        result == 'mock hello'
    }

    def "interface mocking뒤 실행 후, 검증성공을 확인한다."() {
        given:
        Board board = Mock()
        board.write('test content') >> 'write ok!'

        when:
        board.write('test content')

        then:
        1 * board.write('test content')
    }
}