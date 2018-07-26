package com.nio;



import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class CopyFile
{
  static public void main( String args[] ) throws Exception {
 /*   if (args.length<2) {
      System.err.println( "Usage: java CopyFile infile outfile" );
      System.exit( 1 );
    }*/

  /*  String infile = args[0];
    String outfile = args[1];*/

	 InputStream inputStream; 
     FileInputStream fin = new FileInputStream( new File("Test.txt") );
     FileOutputStream fout = new FileOutputStream( new File("Test2.txt") );

    FileChannel fcin = fin.getChannel();
    FileChannel fcout = fout.getChannel();

    ByteBuffer buffer = ByteBuffer.allocate( 1024 );

    while (true) {
      buffer.clear();

      int r = fcin.read( buffer );

      if (r==-1) {
        break;
      }

      buffer.flip();

      fcout.write( buffer );
    }
  }
}
