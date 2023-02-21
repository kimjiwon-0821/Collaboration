package com.mhj.s2.util;

public class PagerK {
		private String kind;
		private String search;
		private Long perPage;
		private Long perBlock;
		private Long totalPage;
		private Long page;
		private Long startRow;
		private Long lastRow;
		private Long startNum;
		private Long lastNum;
		
		private boolean before;
		private boolean after;
		
		public void makeRow() {
			this.startRow = (this.getPage()-1)*this.getPerPage()+1;
			this.lastRow = this.getPage()*this.getPerPage();
		}
		
		//startNum, lastNum
		public void makeNum(Long totalCount) {
			this.totalPage = totalCount/this.getPerPage();
			if(totalCount%this.getPerPage()!=0) {
				totalPage++;
			}
			Long totalBlock = totalPage/this.getPerBlock();
			if(totalPage%this.getPerBlock()!=0) {
				totalBlock++;
			}
			Long curBlock = this.getPage()/this.getPerBlock();
			if(this.getPage()%this.getPerBlock() !=0) {
				curBlock++;
			}
			this.startNum=(curBlock-1)*this.getPerBlock()+1;
			this.lastNum=curBlock*this.getPerBlock();
			
			if(this.getPage()>totalPage) {
				this.setPage(totalPage);
			}
			
			this.after=true;
			if(curBlock==totalBlock) {
				this.lastNum = totalPage;
				this.after=false;
			}
			if(curBlock==1) {
				this.before=true;
			}
		}
		
		public Long getPerPage() {
			if(this.perPage==null || this.perPage==0)
				this.perPage=10L;
			return perPage;
		}
		public void setPerPage(Long perPage) {
			this.perPage = perPage;
		}
		public Long getPage() {
			if(this.page==null || this.page<=0)
				this.page=1L;
			return page;
		}
		public void setPage(Long page) {
			this.page = page;
		}
		public Long getStartRow() {
			return startRow;
		}
		public void setStartRow(Long startRow) {
			this.startRow = startRow;
		}
		public Long getLastRow() {
			return lastRow;
		}
		public void setLastRow(Long lastRow) {
			this.lastRow = lastRow;
		}

		public Long getStartNum() {
			return startNum;
		}

		public void setStartNum(Long startNum) {
			this.startNum = startNum;
		}

		public Long getLastNum() {
			return lastNum;
		}

		public void setLastNum(Long lastNum) {
			this.lastNum = lastNum;
		}

		public boolean isAfter() {
			return after;
		}

		public void setAfter(boolean after) {
			this.after = after;
		}

		public boolean isBefore() {
			return before;
		}

		public void setBefore(boolean before) {
			this.before = before;
		}

		public Long getPerBlock() {
			if(this.perBlock==null || this.perBlock<1) {
				this.perBlock=5L;
			}
			return perBlock;
		}

		public void setPerBlock(Long perBlock) {
			this.perBlock = perBlock;
		}

		public Long getTotalPage() { //밖에서 값을 받을 필요가 없기 때문에 getter만 만듬.
			return totalPage;
		}

		public String getKind() {
			return kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public String getSearch() {
			if(search==null) {
				search="";
			}
			return search;//"%"+search+"%";
		}

		public void setSearch(String search) {
			this.search = search;
		}

}
