// $Id$

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class CreateArrayBuffer
{
  static public void main( String args[] ) throws Exception {
    byte array[] = new byte[1024];

    ByteBuffer buffer = ByteBuffer.wrap( array );

    buffer.put( (byte)'a' );
    buffer.put( (byte)'b' );
    buffer.put( (byte)'c' );
    //clear() 方法重设缓冲区，使它可以接受读入的数据。
    // flip() 方法让缓冲区可以将新读入的数据写入另一个通道。
    //flip()方法做两件事情：这个方法做两件非常重要的事：1、它将 limit 设置为当前 position；2、它将 position 设置为 0。
    //clear()方法Clear 做两种非常重要的事情：1、它将 limit 设置为与 capacity 相同。2、它设置 position 为 0。
    buffer.flip();

    System.out.println( (char)buffer.get() );
    System.out.println( (char)buffer.get() );
    System.out.println( (char)buffer.get() );
  }
}
