package edu.bit.board.BoardVO;

import java.security.Timestamp;


public class BoardVO {
	
		int bId;
		String bname;
		String btitle;
		String bContent;
		Timestamp bDate;
		int bHit;
		int bGroup;
		int bStep;
		int bIndent;
		
		public BoardVO() {}
		
		public BoardVO(int bId, String bname, String btitle, String bContent, Timestamp bDate, int bHit, int bGroup,
				int bStep, int bIndent) {
			super();
			this.bId = bId;
			this.bname = bname;
			this.btitle = btitle;
			this.bContent = bContent;
			this.bDate = bDate;
			this.bHit = bHit;
			this.bGroup = bGroup;
			this.bStep = bStep;
			this.bIndent = bIndent;
			
			
		}
		public int getbId() {
			return bId;
		}
		public void setbId(int bId) {
			this.bId = bId;
		}
		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public String getBtitle() {
			return btitle;
		}
		public void setBtitle(String btitle) {
			this.btitle = btitle;
		}
		public String getbContent() {
			return bContent;
		}
		public void setbContent(String bContent) {
			this.bContent = bContent;
		}
		public Timestamp getbDate() {
			return bDate;
		}
		public void setbDate(Timestamp bDate) {
			this.bDate = bDate;
		}
		public int getbHit() {
			return bHit;
		}
		public void setbHit(int bHit) {
			this.bHit = bHit;
		}
		public int getbGroup() {
			return bGroup;
		}
		public void setbGroup(int bGroup) {
			this.bGroup = bGroup;
		}
		public int getbStep() {
			return bStep;
		}
		public void setbStep(int bStep) {
			this.bStep = bStep;
		}
		public int getbIndent() {
			return bIndent;
		}
		public void setbIndent(int bIndent) {
			this.bIndent = bIndent;
		}
		

	}


